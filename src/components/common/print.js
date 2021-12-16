export default {
  data () {
    return {
    }
  },
  methods: {
    printMe (name) {
      window.scrollTo(0, 0);
      const prtHtml = document.getElementById('toPrint').innerHTML;

      // Get all stylesheets HTML
      let stylesHtml = '';
      for (const node of [...document.querySelectorAll('link[rel="stylesheet"], style')]) {
        stylesHtml += node.outerHTML;
      }
      let title = '<title>' + (name || 'invoice') +'</title>'

      // Open the print window
      const WinPrint = window.open('', '', 'left=0,top=0,width=790,height=900,toolbar=0,scrollbars=0,status=0');

      var content = '<html><head>' + title + stylesHtml + '</head>';
      content += '<body class="v-application theme--light">' + prtHtml + '</body></html>';

      WinPrint.document.write(content);

      setTimeout(() => {
        WinPrint.document.close();
        WinPrint.focus();
        WinPrint.print();
        WinPrint.close();
      }, 1000);
    }
  }
}
