/**********************************************************************
Copyright (c) 2000, 2002 IBM Corp. and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Common Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/cpl-v10.html

Contributors:
    IBM Corporation - Initial implementation
**********************************************************************/
package org.eclipse.ui.texteditor;

/**
 * Extension interface for <code>IFindReplaceTarget</code>. Extends the find replace target with
 * the concept of state validation.
 * 
 * @since 2.1
 */
public interface IFindReplaceTargetExtension2 {
	
	/**
	 * Validates the state of this target. The predominate intent of this method
	 * is to take any action propably necessary to ensure that the target can
	 * persistently be changed. Returns <code>true</code> if the target was
	 * validated, <code>false</code> otherwise.
	 */
	boolean validateTargetState();
}
