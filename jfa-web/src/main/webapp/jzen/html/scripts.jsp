<%--
  ~ Copyright (c) 2015. Bond(China), java freestyle app
  --%>

<script type="text/javascript">
	(function(global){
		global.appPath = '<%=request.getContextPath()%>';		
		global.Consts = {};
		global.Consts.getAppPath = function(url){
			if(url == undefined || url == null){
				url = "";
			}
			return global.appPath + "/" + url;
		};
		global.Consts.getAppJsPath = function(js){			
			return global.appPath + '/js/' + js;
		};
	})(window.top);
</script>
<script type="text/javascript" src="<%=request.getContextPath() %>/jzen/scripts/lib/require.js"  data-main="<%=request.getContextPath() %>/jzen/scripts/lib/config.js">		
</script>
