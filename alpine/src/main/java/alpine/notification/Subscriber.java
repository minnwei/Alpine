/*
 * This file is part of Alpine.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) Steve Springett. All Rights Reserved.
 */
package alpine.notification;

/**
 * All subscribers need to implement this interface. Subscribers are informed
 * of events they are subscribed to via the inform method.
 *
 * @author Steve Springett
 * @since 1.3.0
 */
public interface Subscriber {

    /**
     * Defines a method to inform subscribers who implement this interface.
     * @param notification the Event to subscribe to
     * @since 1.3.0
     */
    void inform(Notification notification);

}