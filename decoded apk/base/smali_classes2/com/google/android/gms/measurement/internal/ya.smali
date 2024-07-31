.class final Lcom/google/android/gms/measurement/internal/ya;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/fb;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/va;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/va;Lcom/google/android/gms/measurement/internal/fb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/ya;->b:Lcom/google/android/gms/measurement/internal/va;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/ya;->a:Lcom/google/android/gms/measurement/internal/fb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ya;->b:Lcom/google/android/gms/measurement/internal/va;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/ya;->a:Lcom/google/android/gms/measurement/internal/fb;

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/va;->r(Lcom/google/android/gms/measurement/internal/va;Lcom/google/android/gms/measurement/internal/fb;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ya;->b:Lcom/google/android/gms/measurement/internal/va;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/va;->n0()V

    return-void
.end method
