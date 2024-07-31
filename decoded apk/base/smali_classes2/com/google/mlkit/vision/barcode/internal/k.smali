.class final Lcom/google/mlkit/vision/barcode/internal/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/mlkit/vision/barcode/internal/j;


# static fields
.field private static final h:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private final d:Landroid/content/Context;

.field private final e:Lvf/b;

.field private final f:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;

.field private g:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "com.google.android.gms.vision.barcode"

    const-string v1, "com.google.android.gms.tflite_dynamite"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;->zzh(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/vision/barcode/internal/k;->h:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lvf/b;Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/k;->d:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/mlkit/vision/barcode/internal/k;->e:Lvf/b;

    iput-object p3, p0, Lcom/google/mlkit/vision/barcode/internal/k;->f:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;

    return-void
.end method

.method static b(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "com.google.mlkit.dynamite.barcode"

    invoke-static {p0, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Lag/a;)Ljava/util/List;
    .locals 10

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->g:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/mlkit/vision/barcode/internal/k;->zzc()Z

    :cond_0
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->g:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;

    iget-boolean v1, p0, Lcom/google/mlkit/vision/barcode/internal/k;->a:Z

    const/16 v2, 0xd

    if-nez v1, :cond_1

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;->zze()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/mlkit/vision/barcode/internal/k;->a:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Lqf/a;

    const-string v1, "Failed to init barcode scanner."

    invoke-direct {v0, v1, v2, p1}, Lqf/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lag/a;->k()I

    move-result v1

    invoke-virtual {p1}, Lag/a;->f()I

    move-result v3

    const/16 v4, 0x23

    if-ne v3, v4, :cond_2

    invoke-virtual {p1}, Lag/a;->i()[Landroid/media/Image$Plane;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/media/Image$Plane;

    const/4 v3, 0x0

    aget-object v1, v1, v3

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v1

    :cond_2
    move v5, v1

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwc;

    invoke-virtual {p1}, Lag/a;->f()I

    move-result v4

    invoke-virtual {p1}, Lag/a;->g()I

    move-result v6

    invoke-virtual {p1}, Lag/a;->j()I

    move-result v3

    invoke-static {v3}, Lbg/b;->a(I)I

    move-result v7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwc;-><init>(IIIIJ)V

    invoke-static {}, Lbg/d;->b()Lbg/d;

    move-result-object v3

    invoke-virtual {v3, p1}, Lbg/d;->a(Lag/a;)Lcom/google/android/gms/dynamic/b;

    move-result-object v3

    :try_start_1
    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;->zzd(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwc;)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;

    new-instance v3, Lxf/a;

    new-instance v4, Lzf/c;

    invoke-direct {v4, v2}, Lzf/c;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvj;)V

    invoke-virtual {p1}, Lag/a;->e()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lxf/a;-><init>(Lyf/a;Landroid/graphics/Matrix;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v1

    :catch_1
    move-exception p1

    new-instance v0, Lqf/a;

    const-string v1, "Failed to run barcode scanner."

    invoke-direct {v0, v1, v2, p1}, Lqf/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v0
.end method

.method final c(Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;
    .locals 2

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->d:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvv;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    move-result-object p1

    iget-object p2, p0, Lcom/google/mlkit/vision/barcode/internal/k;->d:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvl;

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->e:Lvf/b;

    invoke-virtual {v0}, Lvf/b;->a()I

    move-result v0

    iget-object v1, p0, Lcom/google/mlkit/vision/barcode/internal/k;->e:Lvf/b;

    invoke-virtual {v1}, Lvf/b;->d()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/mlkit/vision/barcode/internal/k;->e:Lvf/b;

    invoke-virtual {v1}, Lvf/b;->b()Lvf/d;

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-direct {p3, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvl;-><init>(IZ)V

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzd(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvl;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;

    move-result-object p1

    return-object p1
.end method

.method public final zzb()V
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->g:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;->zzf()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "DecoupledBarcodeScanner"

    const-string v2, "Failed to release barcode scanner."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->g:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->a:Z

    :cond_0
    return-void
.end method

.method public final zzc()Z
    .locals 4

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->g:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->b:Z

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/mlkit/vision/barcode/internal/k;->b(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0xd

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lcom/google/mlkit/vision/barcode/internal/k;->b:Z

    :try_start_0
    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->c:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v1, "com.google.mlkit.dynamite.barcode"

    const-string v3, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator"

    invoke-virtual {p0, v0, v1, v3}, Lcom/google/mlkit/vision/barcode/internal/k;->c(Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;

    move-result-object v0

    iput-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->g:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lqf/a;

    const-string v3, "Failed to create thick barcode scanner."

    invoke-direct {v1, v3, v2, v0}, Lqf/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lqf/a;

    const-string v3, "Failed to load the bundled barcode module."

    invoke-direct {v1, v3, v2, v0}, Lqf/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->b:Z

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->d:Landroid/content/Context;

    sget-object v3, Lcom/google/mlkit/vision/barcode/internal/k;->h:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    invoke-static {v0, v3}, Lcom/google/mlkit/common/sdkinternal/m;->a(Landroid/content/Context;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->c:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->d:Landroid/content/Context;

    const-string v2, "barcode"

    const-string v3, "tflite_dynamite"

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;->zzh(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/mlkit/common/sdkinternal/m;->d(Landroid/content/Context;Ljava/util/List;)V

    iput-boolean v1, p0, Lcom/google/mlkit/vision/barcode/internal/k;->c:Z

    :cond_2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->f:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;->zzB:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    invoke-static {v0, v1}, Lcom/google/mlkit/vision/barcode/internal/b;->e(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;)V

    new-instance v0, Lqf/a;

    const-string v1, "Waiting for the barcode module to be downloaded. Please wait."

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lqf/a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_3
    :try_start_1
    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v1, "com.google.android.gms.vision.barcode"

    const-string v3, "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator"

    invoke-virtual {p0, v0, v1, v3}, Lcom/google/mlkit/vision/barcode/internal/k;->c(Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;

    move-result-object v0

    iput-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->g:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvt;
    :try_end_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_1 .. :try_end_1} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    :goto_0
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->f:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    invoke-static {v0, v1}, Lcom/google/mlkit/vision/barcode/internal/b;->e(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;)V

    iget-boolean v0, p0, Lcom/google/mlkit/vision/barcode/internal/k;->b:Z

    return v0

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    :goto_1
    iget-object v1, p0, Lcom/google/mlkit/vision/barcode/internal/k;->f:Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;

    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;->zzC:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    invoke-static {v1, v3}, Lcom/google/mlkit/vision/barcode/internal/b;->e(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztx;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;)V

    new-instance v1, Lqf/a;

    const-string v3, "Failed to create thin barcode scanner."

    invoke-direct {v1, v3, v2, v0}, Lqf/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1
.end method
