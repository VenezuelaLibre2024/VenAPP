.class public final synthetic Lm9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lx8/c;

.field public final synthetic c:Lx8/h;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lm9/b;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lx8/c;Lx8/h;Ljava/lang/String;Lm9/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/e;->a:Landroid/content/Context;

    iput-object p2, p0, Lm9/e;->b:Lx8/c;

    iput-object p3, p0, Lm9/e;->c:Lx8/h;

    iput-object p4, p0, Lm9/e;->d:Ljava/lang/String;

    iput-object p5, p0, Lm9/e;->e:Lm9/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lm9/e;->c:Lx8/h;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbxk;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lx8/h;->a()Lcom/google/android/gms/ads/internal/client/z2;

    move-result-object v0

    :goto_0
    iget-object v2, p0, Lm9/e;->e:Lm9/b;

    iget-object v3, p0, Lm9/e;->d:Ljava/lang/String;

    iget-object v4, p0, Lm9/e;->b:Lx8/c;

    iget-object v5, p0, Lm9/e;->a:Landroid/content/Context;

    invoke-direct {v1, v5, v4, v0, v3}, Lcom/google/android/gms/internal/ads/zzbxk;-><init>(Landroid/content/Context;Lx8/c;Lcom/google/android/gms/ads/internal/client/z2;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzbxk;->zzb(Lm9/b;)V

    return-void
.end method
