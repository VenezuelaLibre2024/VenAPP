.class public final synthetic Lg9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzckw;


# instance fields
.field public final synthetic a:Lg9/u;


# direct methods
.method public synthetic constructor <init>(Lg9/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/l;->a:Lg9/u;

    return-void
.end method


# virtual methods
.method public final zza(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lg9/l;->a:Lg9/u;

    iget-object p1, p1, Lg9/u;->c:Lcom/google/android/gms/internal/ads/zzcjk;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcjk;->zzY()V

    :cond_0
    return-void
.end method
