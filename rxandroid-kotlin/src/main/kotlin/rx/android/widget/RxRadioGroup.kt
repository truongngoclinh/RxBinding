package rx.android.widget

import android.widget.RadioGroup
import rx.Observable
import rx.functions.Action1

/**
 * Create an observable of the checked view ID changes in {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 */
fun RadioGroup.checkedChanges(view: RadioGroup): Observable<Int> = RxRadioGroup.checkedChanges(view)

/**
 * Create an observable of the checked view ID change events in {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 */
fun RadioGroup.checkedChangeEvents(view: RadioGroup): Observable<RadioGroupCheckedChangeEvent> = RxRadioGroup.checkedChangeEvents(view)

/**
 * An action which sets the checked child of {@code view} with ID. Passing {@code -1} will clear
 * any checked view.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 */
fun RadioGroup.checked(view: RadioGroup): Action1<in Int> = RxRadioGroup.setChecked(view)
