.class final Lgd/g$c;
.super Lcom/google/android/gms/common/api/internal/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgd/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/internal/w<",
        "Lgd/e;",
        "Lfd/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final d:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x3392

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/google/android/gms/common/api/internal/w;-><init>([Lca/d;ZI)V

    iput-object p1, p0, Lgd/g$c;->d:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method protected bridge synthetic b(Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    check-cast p1, Lgd/e;

    invoke-virtual {p0, p1, p2}, Lgd/g$c;->f(Lgd/e;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method protected f(Lgd/e;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgd/e;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lfd/d;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lgd/g$b;

    invoke-direct {v0, p2}, Lgd/g$b;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object p2, p0, Lgd/g$c;->d:Landroid/os/Bundle;

    invoke-virtual {p1, v0, p2}, Lgd/e;->d(Lgd/h$a;Landroid/os/Bundle;)V

    return-void
.end method
