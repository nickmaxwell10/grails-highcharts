class HighchartsGrailsPlugin {
    // the plugin version
    def version = "2.2.3"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.0 > *"
    // the other plugins this plugin depends on
    def dependsOn = ['jquery': '* > 1.7.1']
	
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
    ]

    // TODO Fill in these fields
    def title = "Highcharts Plugin" // Headline display name of the plugin
    def author = "Alessandro Oliveira"
    def authorEmail = "alessandro.oliveira@me.com"
    def description = '''\
This plugin packages the highcharts in order to be used by grails applications.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/highcharts"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "Creative Commons Attribution-NonCommercial 3.0"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Highsoft", url: "http://www.highcharts.com" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.grails-plugins.codehaus.org/browse/grails-plugins/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
