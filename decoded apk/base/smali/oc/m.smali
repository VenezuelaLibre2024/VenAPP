.class final Loc/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/Continuation<",
        "Lcom/google/firebase/auth/i;",
        "Lcom/google/android/gms/tasks/Task<",
        "Lcom/google/firebase/auth/i;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final synthetic a:Loc/j;


# direct methods
.method constructor <init>(Loc/j;)V
    .locals 0

    iput-object p1, p0, Loc/m;->a:Loc/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Loc/m;->a:Loc/j;

    invoke-static {v0}, Loc/j;->y1(Loc/j;)Lcom/google/firebase/auth/d2;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/i;

    new-instance v0, Loc/w1;

    invoke-interface {p1}, Lcom/google/firebase/auth/i;->j0()Lcom/google/firebase/auth/a0;

    move-result-object v1

    check-cast v1, Loc/d;

    invoke-interface {p1}, Lcom/google/firebase/auth/i;->W0()Lcom/google/firebase/auth/g;

    move-result-object p1

    check-cast p1, Loc/u1;

    iget-object v2, p0, Loc/m;->a:Loc/j;

    invoke-static {v2}, Loc/j;->y1(Loc/j;)Lcom/google/firebase/auth/d2;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Loc/w1;-><init>(Loc/d;Loc/u1;Lcom/google/firebase/auth/d2;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    instance-of v0, p1, Lcom/google/firebase/auth/x;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/google/firebase/auth/x;

    iget-object v1, p0, Loc/m;->a:Loc/j;

    invoke-static {v1}, Loc/j;->y1(Loc/j;)Lcom/google/firebase/auth/d2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/x;->d(Lcom/google/firebase/auth/h;)Lcom/google/firebase/auth/x;

    :cond_2
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
