/*******************************************************************************
 * Copyright (c) 2015 Arieh "Vainolo" Bibliowicz and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package iotwearable.editor.figure;

import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class MultiLineTextCellEditor extends TextCellEditor {
  private static final int defaultStyle = SWT.MULTI | SWT.WRAP;

  public MultiLineTextCellEditor() {
    setStyle(defaultStyle);
  }

  public MultiLineTextCellEditor(Composite parent) {
    this(parent, defaultStyle);
  }

  public MultiLineTextCellEditor(Composite parent, int style) {
    super(parent, style);
  }
}
