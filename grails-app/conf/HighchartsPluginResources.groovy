modules = {
    'highcharts' {
        dependsOn 'jquery-ui'
        resource id:'js', url:[plugin: 'highcharts', dir:'js/highcharts', file:"highcharts.js"],
            disposition:'head', nominify: true
    }

	'highcharts-modules-canvas' {
		dependsOn 'highcharts'
		resource id:'js', url:[plugin: 'highcharts', dir:'js/highcharts/modules', file:"canvas-tools.js"],
			disposition:'head', nominify: true
	}
	
	'highcharts-modules-exporting' {
		dependsOn 'highcharts'
		resource id:'js', url:[plugin: 'highcharts', dir:'js/highcharts/modules', file:"exporting.js"],
			disposition:'head', nominify: true
	}
	
	'highcharts-theme-dark-blue' {
		dependsOn 'highcharts'
		resource id:'js', url:[plugin: 'highcharts', dir:'js/highcharts/themes', file:"dark-blue.js"],
			disposition:'head', nominify: true
	}
	
	'highcharts-theme-dark-green' {
		dependsOn 'highcharts'
		resource id:'js', url:[plugin: 'highcharts', dir:'js/highcharts/themes', file:"dark-green.js"],
			disposition:'head', nominify: true
	}
	
	'highcharts-theme-gray' {
		dependsOn 'highcharts'
		resource id:'js', url:[plugin: 'highcharts', dir:'js/highcharts/themes', file:"gray.js"],
			disposition:'head', nominify: true
	}
	
	'highcharts-theme-grid' {
		dependsOn 'highcharts'
		resource id:'js', url:[plugin: 'highcharts', dir:'js/highcharts/themes', file:"grid.js"],
			disposition:'head', nominify: true
	}
}