package org.jenkinsci.plugins.myfirstplugin;

import hudson.Extension;
import hudson.model.RootAction;

/**
 * Created by David on 8/10/17.
 */
@Extension
public class IntroRootAction implements RootAction {

    @Override
    public String getIconFileName() {
        return "clipboard.png";
    }

    @Override
    public String getDisplayName() {
        return "Intro Root Action";
    }

    @Override
    public String getUrlName() {
        return "https://jenkins.io";
    }
}
