/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huopdracht;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "huopdracht.NSTrainAction"
)
@ActionRegistration(
        lazy = false,
        displayName = "#CTL_NSTrainAction"
)
@ActionReference(path = "Toolbars/File", position = 0)
@Messages("CTL_NSTrainAction=TrainChecker")
public final class NSTrainAction extends AbstractAction implements Presenter.Toolbar {

    @Override
    public Component getToolbarPresenter() {
        return new NSInputTrainstations();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Not used because of toolbar
    }
}
