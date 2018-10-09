/*
 * Copyright 2014-2018 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agrona.sbe;

/**
 * An SBE (Simple Binary Encoding) flyweight object.
 */
public interface Flyweight
{
    /**
     * The SBE Schema identifier containing the message declaration.
     *
     * @return the SBE Schema identifier containing the message declaration.
     */
    int sbeSchemaId();

    /**
     * The version number of the SBE Schema containing the message.
     *
     * @return the version number of the SBE Schema containing the message.
     */
    int sbeSchemaVersion();

    /**
     * The length of the encoded type in bytes.
     *
     * @return the length of the encoded type in bytes.
     */
    int encodedLength();
}
