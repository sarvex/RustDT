/*******************************************************************************
 * Copyright (c) 2015, 2015 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.tooling.completion;

/**
 * Throwable result for "soft" failures: these are non-critical failures, 
 * such as invoking content assist on an invalid location.
 * This class exists so that the UI can report these failures to the user in a less intrusive way than
 * a hard error (like an unexpected termination of the Content Assist deamon).
 */
@SuppressWarnings("serial")
public class CompletionSoftFailure extends Throwable {
	
	public CompletionSoftFailure(String message) {
		super(message);
	}
	
}