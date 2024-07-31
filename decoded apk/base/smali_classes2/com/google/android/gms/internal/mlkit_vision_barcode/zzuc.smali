.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/b;


# instance fields
.field public final synthetic zza:Lf6/g;


# direct methods
.method public synthetic constructor <init>(Lf6/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuc;->zza:Lf6/g;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuc;->zza:Lf6/g;

    const-string v1, "json"

    invoke-static {v1}, Lf6/b;->b(Ljava/lang/String;)Lf6/b;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzue;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzue;

    const-string v3, "FIREBASE_ML_SDK"

    const-class v4, [B

    invoke-interface {v0, v3, v4, v1, v2}, Lf6/g;->b(Ljava/lang/String;Ljava/lang/Class;Lf6/b;Lf6/e;)Lf6/f;

    move-result-object v0

    return-object v0
.end method
