.class final Lcom/google/android/gms/measurement/internal/d8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/y6;

.field private final synthetic b:J

.field private final synthetic c:J

.field private final synthetic d:Z

.field private final synthetic e:Lcom/google/android/gms/measurement/internal/y6;

.field private final synthetic f:Lcom/google/android/gms/measurement/internal/b7;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/b7;Lcom/google/android/gms/measurement/internal/y6;JJZLcom/google/android/gms/measurement/internal/y6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/d8;->f:Lcom/google/android/gms/measurement/internal/b7;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/d8;->a:Lcom/google/android/gms/measurement/internal/y6;

    iput-wide p3, p0, Lcom/google/android/gms/measurement/internal/d8;->b:J

    iput-wide p5, p0, Lcom/google/android/gms/measurement/internal/d8;->c:J

    iput-boolean p7, p0, Lcom/google/android/gms/measurement/internal/d8;->d:Z

    iput-object p8, p0, Lcom/google/android/gms/measurement/internal/d8;->e:Lcom/google/android/gms/measurement/internal/y6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/d8;->f:Lcom/google/android/gms/measurement/internal/b7;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d8;->a:Lcom/google/android/gms/measurement/internal/y6;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/b7;->E(Lcom/google/android/gms/measurement/internal/y6;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/d8;->f:Lcom/google/android/gms/measurement/internal/b7;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/d8;->b:J

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/b7;->z(JZ)V

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/d8;->f:Lcom/google/android/gms/measurement/internal/b7;

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/d8;->a:Lcom/google/android/gms/measurement/internal/y6;

    iget-wide v6, p0, Lcom/google/android/gms/measurement/internal/d8;->c:J

    const/4 v8, 0x1

    iget-boolean v9, p0, Lcom/google/android/gms/measurement/internal/d8;->d:Z

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/measurement/internal/b7;->G(Lcom/google/android/gms/measurement/internal/b7;Lcom/google/android/gms/measurement/internal/y6;JZZ)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzps;->zza()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/d8;->f:Lcom/google/android/gms/measurement/internal/b7;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v6;->a()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/e0;->x0:Lcom/google/android/gms/measurement/internal/h4;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/f;->n(Lcom/google/android/gms/measurement/internal/h4;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/d8;->f:Lcom/google/android/gms/measurement/internal/b7;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d8;->a:Lcom/google/android/gms/measurement/internal/y6;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/d8;->e:Lcom/google/android/gms/measurement/internal/y6;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/b7;->H(Lcom/google/android/gms/measurement/internal/b7;Lcom/google/android/gms/measurement/internal/y6;Lcom/google/android/gms/measurement/internal/y6;)V

    :cond_0
    return-void
.end method
