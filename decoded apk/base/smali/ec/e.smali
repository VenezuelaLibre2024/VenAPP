.class public abstract Lec/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljc/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lec/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Lzb/g;)Lec/e;
    .locals 1

    const-class v0, Lec/e;

    invoke-virtual {p0, v0}, Lzb/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lec/e;

    return-object p0
.end method


# virtual methods
.method public abstract c(Lec/e$a;)V
.end method

.method public abstract d(Z)Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lec/c;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f()Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lec/c;",
            ">;"
        }
    .end annotation
.end method

.method public abstract g(Lec/b;)V
.end method

.method public abstract h(Lec/e$a;)V
.end method

.method public abstract i(Z)V
.end method
