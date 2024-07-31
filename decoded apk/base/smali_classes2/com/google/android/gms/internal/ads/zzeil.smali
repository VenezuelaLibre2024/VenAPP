.class public final Lcom/google/android/gms/internal/ads/zzeil;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeil;->zza:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza(Z)Lcom/google/common/util/concurrent/f;
    .locals 2

    new-instance v0, Landroidx/privacysandbox/ads/adservices/topics/a$a;

    invoke-direct {v0}, Landroidx/privacysandbox/ads/adservices/topics/a$a;-><init>()V

    const-string v1, "com.google.android.gms.ads"

    invoke-virtual {v0, v1}, Landroidx/privacysandbox/ads/adservices/topics/a$a;->b(Ljava/lang/String;)Landroidx/privacysandbox/ads/adservices/topics/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/privacysandbox/ads/adservices/topics/a$a;->c(Z)Landroidx/privacysandbox/ads/adservices/topics/a$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/privacysandbox/ads/adservices/topics/a$a;->a()Landroidx/privacysandbox/ads/adservices/topics/a;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeil;->zza:Landroid/content/Context;

    invoke-static {v0}, Lo1/a;->a(Landroid/content/Context;)Lo1/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lo1/a;->b(Landroidx/privacysandbox/ads/adservices/topics/a;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgen;->zzg(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
