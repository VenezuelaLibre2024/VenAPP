.class final Lcom/google/android/gms/measurement/internal/g9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/lb;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/v8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/v8;Lcom/google/android/gms/measurement/internal/lb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/g9;->b:Lcom/google/android/gms/measurement/internal/v8;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/g9;->a:Lcom/google/android/gms/measurement/internal/lb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g9;->b:Lcom/google/android/gms/measurement/internal/v8;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/v8;->w(Lcom/google/android/gms/measurement/internal/v8;)Lwa/i;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g9;->b:Lcom/google/android/gms/measurement/internal/v8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v6;->zzj()Lcom/google/android/gms/measurement/internal/n4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/n4;->B()Lcom/google/android/gms/measurement/internal/p4;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send app launch"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/p4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/g9;->a:Lcom/google/android/gms/measurement/internal/lb;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/g9;->a:Lcom/google/android/gms/measurement/internal/lb;

    invoke-interface {v0, v1}, Lwa/i;->d1(Lcom/google/android/gms/measurement/internal/lb;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/g9;->b:Lcom/google/android/gms/measurement/internal/v8;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z3;->l()Lcom/google/android/gms/measurement/internal/l4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/l4;->E()Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/g9;->b:Lcom/google/android/gms/measurement/internal/v8;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/g9;->a:Lcom/google/android/gms/measurement/internal/lb;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v2}, Lcom/google/android/gms/measurement/internal/v8;->O(Lwa/i;Lea/a;Lcom/google/android/gms/measurement/internal/lb;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g9;->b:Lcom/google/android/gms/measurement/internal/v8;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/v8;->h0(Lcom/google/android/gms/measurement/internal/v8;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/g9;->b:Lcom/google/android/gms/measurement/internal/v8;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/v6;->zzj()Lcom/google/android/gms/measurement/internal/n4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/n4;->B()Lcom/google/android/gms/measurement/internal/p4;

    move-result-object v1

    const-string v2, "Failed to send app launch to the service"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/p4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
