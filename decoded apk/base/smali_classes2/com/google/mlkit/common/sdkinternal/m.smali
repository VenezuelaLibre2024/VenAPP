.class public Lcom/google/mlkit/common/sdkinternal/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Lca/d;

.field public static final b:Lca/d;

.field public static final c:Lca/d;

.field public static final d:Lca/d;

.field public static final e:Lca/d;

.field public static final f:Lca/d;

.field public static final g:Lca/d;

.field public static final h:Lca/d;

.field public static final i:Lca/d;

.field public static final j:Lca/d;

.field public static final k:Lca/d;

.field public static final l:Lca/d;

.field public static final m:Lca/d;

.field public static final n:Lca/d;

.field public static final o:Lca/d;

.field public static final p:Lca/d;

.field public static final q:Lca/d;

.field public static final r:Lca/d;

.field public static final s:Lca/d;

.field public static final t:Lca/d;

.field public static final u:Lca/d;

.field public static final v:Lca/d;

.field private static final w:Lcom/google/android/gms/internal/mlkit_common/zzau;

.field private static final x:Lcom/google/android/gms/internal/mlkit_common/zzau;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    const/4 v0, 0x0

    new-array v0, v0, [Lca/d;

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/m;->a:[Lca/d;

    new-instance v0, Lca/d;

    const-string v1, "vision.barcode"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/m;->b:Lca/d;

    new-instance v1, Lca/d;

    const-string v4, "vision.custom.ica"

    invoke-direct {v1, v4, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lcom/google/mlkit/common/sdkinternal/m;->c:Lca/d;

    new-instance v4, Lca/d;

    const-string v5, "vision.face"

    invoke-direct {v4, v5, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lcom/google/mlkit/common/sdkinternal/m;->d:Lca/d;

    new-instance v5, Lca/d;

    const-string v6, "vision.ica"

    invoke-direct {v5, v6, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lcom/google/mlkit/common/sdkinternal/m;->e:Lca/d;

    new-instance v6, Lca/d;

    const-string v7, "vision.ocr"

    invoke-direct {v6, v7, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lcom/google/mlkit/common/sdkinternal/m;->f:Lca/d;

    new-instance v7, Lca/d;

    const-string v8, "mlkit.ocr.chinese"

    invoke-direct {v7, v8, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lcom/google/mlkit/common/sdkinternal/m;->g:Lca/d;

    new-instance v7, Lca/d;

    const-string v8, "mlkit.ocr.common"

    invoke-direct {v7, v8, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lcom/google/mlkit/common/sdkinternal/m;->h:Lca/d;

    new-instance v7, Lca/d;

    const-string v8, "mlkit.ocr.devanagari"

    invoke-direct {v7, v8, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lcom/google/mlkit/common/sdkinternal/m;->i:Lca/d;

    new-instance v7, Lca/d;

    const-string v8, "mlkit.ocr.japanese"

    invoke-direct {v7, v8, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lcom/google/mlkit/common/sdkinternal/m;->j:Lca/d;

    new-instance v7, Lca/d;

    const-string v8, "mlkit.ocr.korean"

    invoke-direct {v7, v8, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lcom/google/mlkit/common/sdkinternal/m;->k:Lca/d;

    new-instance v7, Lca/d;

    const-string v8, "mlkit.langid"

    invoke-direct {v7, v8, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lcom/google/mlkit/common/sdkinternal/m;->l:Lca/d;

    new-instance v8, Lca/d;

    const-string v9, "mlkit.nlclassifier"

    invoke-direct {v8, v9, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v8, Lcom/google/mlkit/common/sdkinternal/m;->m:Lca/d;

    new-instance v9, Lca/d;

    const-string v10, "tflite_dynamite"

    invoke-direct {v9, v10, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v9, Lcom/google/mlkit/common/sdkinternal/m;->n:Lca/d;

    new-instance v11, Lca/d;

    const-string v12, "mlkit.barcode.ui"

    invoke-direct {v11, v12, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v11, Lcom/google/mlkit/common/sdkinternal/m;->o:Lca/d;

    new-instance v12, Lca/d;

    const-string v13, "mlkit.smartreply"

    invoke-direct {v12, v13, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v12, Lcom/google/mlkit/common/sdkinternal/m;->p:Lca/d;

    new-instance v13, Lca/d;

    const-string v14, "mlkit.image.caption"

    invoke-direct {v13, v14, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v13, Lcom/google/mlkit/common/sdkinternal/m;->q:Lca/d;

    new-instance v13, Lca/d;

    const-string v14, "mlkit.docscan.detect"

    invoke-direct {v13, v14, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v13, Lcom/google/mlkit/common/sdkinternal/m;->r:Lca/d;

    new-instance v13, Lca/d;

    const-string v14, "mlkit.docscan.crop"

    invoke-direct {v13, v14, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v13, Lcom/google/mlkit/common/sdkinternal/m;->s:Lca/d;

    new-instance v13, Lca/d;

    const-string v14, "mlkit.docscan.enhance"

    invoke-direct {v13, v14, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v13, Lcom/google/mlkit/common/sdkinternal/m;->t:Lca/d;

    new-instance v13, Lca/d;

    const-string v14, "mlkit.quality.aesthetic"

    invoke-direct {v13, v14, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v13, Lcom/google/mlkit/common/sdkinternal/m;->u:Lca/d;

    new-instance v13, Lca/d;

    const-string v14, "mlkit.quality.technical"

    invoke-direct {v13, v14, v2, v3}, Lca/d;-><init>(Ljava/lang/String;J)V

    sput-object v13, Lcom/google/mlkit/common/sdkinternal/m;->v:Lca/d;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_common/zzat;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mlkit_common/zzat;-><init>()V

    const-string v3, "barcode"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v3, "custom_ica"

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v3, "face"

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v3, "ica"

    invoke-virtual {v2, v3, v5}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v3, "ocr"

    invoke-virtual {v2, v3, v6}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v3, "langid"

    invoke-virtual {v2, v3, v7}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v3, "nlclassifier"

    invoke-virtual {v2, v3, v8}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    invoke-virtual {v2, v10, v9}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v3, "barcode_ui"

    invoke-virtual {v2, v3, v11}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v3, "smart_reply"

    invoke-virtual {v2, v3, v12}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzau;

    move-result-object v2

    sput-object v2, Lcom/google/mlkit/common/sdkinternal/m;->w:Lcom/google/android/gms/internal/mlkit_common/zzau;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_common/zzat;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mlkit_common/zzat;-><init>()V

    const-string v3, "com.google.android.gms.vision.barcode"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v0, "com.google.android.gms.vision.custom.ica"

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v0, "com.google.android.gms.vision.face"

    invoke-virtual {v2, v0, v4}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v0, "com.google.android.gms.vision.ica"

    invoke-virtual {v2, v0, v5}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v0, "com.google.android.gms.vision.ocr"

    invoke-virtual {v2, v0, v6}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v0, "com.google.android.gms.mlkit.langid"

    invoke-virtual {v2, v0, v7}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v0, "com.google.android.gms.mlkit.nlclassifier"

    invoke-virtual {v2, v0, v8}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v0, "com.google.android.gms.tflite_dynamite"

    invoke-virtual {v2, v0, v9}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    const-string v0, "com.google.android.gms.mlkit_smartreply"

    invoke-virtual {v2, v0, v12}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzat;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_common/zzat;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzau;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/m;->x:Lcom/google/android/gms/internal/mlkit_common/zzau;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lca/g;->f()Lca/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lca/g;->a(Landroid/content/Context;)I

    move-result v0

    const v1, 0xd33d260

    if-lt v0, v1, :cond_0

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/m;->x:Lcom/google/android/gms/internal/mlkit_common/zzau;

    invoke-static {v0, p1}, Lcom/google/mlkit/common/sdkinternal/m;->f(Ljava/util/Map;Ljava/util/List;)[Lca/d;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/mlkit/common/sdkinternal/m;->b(Landroid/content/Context;[Lca/d;)Z

    move-result p0

    return p0

    :cond_0
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Landroid/content/Context;[Lca/d;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Lha/c;->a(Landroid/content/Context;)Lha/d;

    move-result-object p0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/common/api/g;

    new-instance v2, Lcom/google/mlkit/common/sdkinternal/b0;

    invoke-direct {v2, p1}, Lcom/google/mlkit/common/sdkinternal/b0;-><init>([Lca/d;)V

    aput-object v2, v1, v0

    invoke-interface {p0, v1}, Lha/d;->c([Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    sget-object p1, Lcom/google/mlkit/common/sdkinternal/c0;->a:Lcom/google/mlkit/common/sdkinternal/c0;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lha/b;

    invoke-virtual {p0}, Lha/b;->u1()Z

    move-result p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    const-string p1, "OptionalModuleUtils"

    const-string v1, "Failed to complete the task of features availability check"

    invoke-static {p1, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_common/zzar;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzar;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/mlkit/common/sdkinternal/m;->d(Landroid/content/Context;Ljava/util/List;)V

    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lca/g;->f()Lca/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lca/g;->a(Landroid/content/Context;)I

    move-result v0

    const v1, 0xd33d260

    if-lt v0, v1, :cond_0

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/m;->w:Lcom/google/android/gms/internal/mlkit_common/zzau;

    invoke-static {v0, p1}, Lcom/google/mlkit/common/sdkinternal/m;->f(Ljava/util/Map;Ljava/util/List;)[Lca/d;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/mlkit/common/sdkinternal/m;->e(Landroid/content/Context;[Lca/d;)V

    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.google.android.gms"

    const-string v2, "com.google.android.gms.vision.DependencyBroadcastReceiverProxy"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.google.android.gms.vision.DEPENDENCY"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, ","

    invoke-static {v1, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "com.google.android.gms.vision.DEPENDENCIES"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-string v1, "requester_app_package"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public static e(Landroid/content/Context;[Lca/d;)V
    .locals 2

    invoke-static {}, Lha/f;->d()Lha/f$a;

    move-result-object v0

    new-instance v1, Lcom/google/mlkit/common/sdkinternal/d0;

    invoke-direct {v1, p1}, Lcom/google/mlkit/common/sdkinternal/d0;-><init>([Lca/d;)V

    invoke-virtual {v0, v1}, Lha/f$a;->a(Lcom/google/android/gms/common/api/g;)Lha/f$a;

    move-result-object p1

    invoke-virtual {p1}, Lha/f$a;->b()Lha/f;

    move-result-object p1

    invoke-static {p0}, Lha/c;->a(Landroid/content/Context;)Lha/d;

    move-result-object p0

    invoke-interface {p0, p1}, Lha/d;->b(Lha/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    sget-object p1, Lcom/google/mlkit/common/sdkinternal/e0;->a:Lcom/google/mlkit/common/sdkinternal/e0;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static f(Ljava/util/Map;Ljava/util/List;)[Lca/d;
    .locals 3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lca/d;

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lca/d;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lca/d;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
