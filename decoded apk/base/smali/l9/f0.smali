.class public final synthetic Ll9/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ll9/c;

.field public final synthetic b:[Lcom/google/android/gms/internal/ads/zzdrz;


# direct methods
.method public synthetic constructor <init>(Ll9/c;[Lcom/google/android/gms/internal/ads/zzdrz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/f0;->a:Ll9/c;

    iput-object p2, p0, Ll9/f0;->b:[Lcom/google/android/gms/internal/ads/zzdrz;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ll9/f0;->a:Ll9/c;

    iget-object v1, p0, Ll9/f0;->b:[Lcom/google/android/gms/internal/ads/zzdrz;

    invoke-virtual {v0, v1}, Ll9/c;->q2([Lcom/google/android/gms/internal/ads/zzdrz;)V

    return-void
.end method
