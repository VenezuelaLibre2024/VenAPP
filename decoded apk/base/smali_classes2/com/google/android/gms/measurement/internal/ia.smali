.class final Lcom/google/android/gms/measurement/internal/ia;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/android/gms/measurement/internal/ha;

.field final synthetic b:Lcom/google/android/gms/measurement/internal/da;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/da;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/ia;->b:Lcom/google/android/gms/measurement/internal/da;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ia;->b:Lcom/google/android/gms/measurement/internal/da;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v6;->i()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ia;->a:Lcom/google/android/gms/measurement/internal/ha;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ia;->b:Lcom/google/android/gms/measurement/internal/da;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/da;->w(Lcom/google/android/gms/measurement/internal/da;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/ia;->a:Lcom/google/android/gms/measurement/internal/ha;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ia;->b:Lcom/google/android/gms/measurement/internal/da;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v6;->e()Lcom/google/android/gms/measurement/internal/y4;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/y4;->s:Lcom/google/android/gms/measurement/internal/b5;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/b5;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ia;->b:Lcom/google/android/gms/measurement/internal/da;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/da;->y(Z)V

    return-void
.end method

.method final b(J)V
    .locals 7

    new-instance v6, Lcom/google/android/gms/measurement/internal/ha;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ia;->b:Lcom/google/android/gms/measurement/internal/da;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v6;->zzb()Lla/f;

    move-result-object v0

    invoke-interface {v0}, Lla/f;->a()J

    move-result-wide v2

    move-object v0, v6

    move-object v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/ha;-><init>(Lcom/google/android/gms/measurement/internal/ia;JJ)V

    iput-object v6, p0, Lcom/google/android/gms/measurement/internal/ia;->a:Lcom/google/android/gms/measurement/internal/ha;

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/ia;->b:Lcom/google/android/gms/measurement/internal/da;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/da;->w(Lcom/google/android/gms/measurement/internal/da;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/ia;->a:Lcom/google/android/gms/measurement/internal/ha;

    const-wide/16 v0, 0x7d0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
