/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.yura.domination.engine.ai.planrecognition.planlibraryobjects.components.action;

import java.io.Serializable;
import net.yura.domination.engine.ai.planrecognition.ActionConstants;

/**
 *
 * @author s0914007
 */
public class ActionFailedDefence extends BasicAction implements Serializable{
    
    public ActionFailedDefence(String countryName, double probability){
        
        super(ActionConstants.failedDefence, countryName, probability);
    }
}