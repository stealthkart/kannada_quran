/*
 * This code is based on the RandomMusicPlayer example from
 * the Android Open Source Project samples.  It has been modified
 * for use in Quran Android.
 *
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.quran.labs.androidquran.service.util

/**
 * Represents something that can react to audio focus events. We implement this instead of just
 * using AudioManager.OnAudioFocusChangeListener because that interface is only available in SDK
 * level 8 and above, and we want our application to work on previous SDKs.
 */
interface AudioFocusable {
  /** Signals that audio focus was gained.  */
  fun onGainedAudioFocus()

  /**
   * Signals that audio focus was lost.
   *
   * @param canDuck If true, audio can continue in "ducked" mode (low volume). Otherwise, all
   * audio must stop.
   */
  fun onLostAudioFocus(canDuck: Boolean)
}
