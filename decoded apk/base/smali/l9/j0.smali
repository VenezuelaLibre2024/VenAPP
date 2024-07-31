.class public final synthetic Ll9/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ll9/c;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzccx;


# direct methods
.method public synthetic constructor <init>(Ll9/c;Lcom/google/android/gms/internal/ads/zzccx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/j0;->a:Ll9/c;

    iput-object p2, p0, Ll9/j0;->b:Lcom/google/android/gms/internal/ads/zzccx;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ll9/j0;->a:Ll9/c;

    iget-object v1, p0, Ll9/j0;->b:Lcom/google/android/gms/internal/ads/zzccx;

    invoke-virtual {v0, v1}, Ll9/c;->O2(Lcom/google/android/gms/internal/ads/zzccx;)Ll9/a0;

    move-result-object v0

    return-object v0
.end method
