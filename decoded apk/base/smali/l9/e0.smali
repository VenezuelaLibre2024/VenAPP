.class public final synthetic Ll9/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgdu;


# instance fields
.field public final synthetic a:Ll9/c;

.field public final synthetic b:[Lcom/google/android/gms/internal/ads/zzdrz;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll9/c;[Lcom/google/android/gms/internal/ads/zzdrz;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/e0;->a:Ll9/c;

    iput-object p2, p0, Ll9/e0;->b:[Lcom/google/android/gms/internal/ads/zzdrz;

    iput-object p3, p0, Ll9/e0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 3

    iget-object v0, p0, Ll9/e0;->a:Ll9/c;

    iget-object v1, p0, Ll9/e0;->b:[Lcom/google/android/gms/internal/ads/zzdrz;

    iget-object v2, p0, Ll9/e0;->c:Ljava/lang/String;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzdrz;

    invoke-virtual {v0, v1, v2, p1}, Ll9/c;->T2([Lcom/google/android/gms/internal/ads/zzdrz;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdrz;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
