/*
 * Copyright (c) 2015, 2022 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//              ljungmann - initial implementation
package org.eclipse.samples;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import org.eclipse.persistence.testing.tests.jpa22.metadata.LogListener;

@Entity
@EntityListeners({LogListener.class})
public @interface LoggableEmployee {

}
