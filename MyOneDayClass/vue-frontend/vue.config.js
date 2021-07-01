const path = require("path");
const resolve = loc => path.resolve(__dirname,loc);

module.exports = {  
    outputDir: "../src/main/resources/static",  
    indexPath: "./src/index.html",  
    devServer: {  
      proxy: {
        '/api': {
          target: "http://localhost:8080"
        }
      }  
    },
    pages: {
      index: {
        entry: './src/main.js',
        template: resolve('./src/index.html'),
        filename: 'index.html'
      }
    }, 
    chainWebpack: config => {  
      const svgRule = config.module.rule("svg");    
      svgRule.uses.clear();    
      svgRule.use("vue-svg-loader").loader("vue-svg-loader");  
    }  
  };