.class final Lgd/g$e;
.super Lcom/google/android/gms/common/api/internal/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgd/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/internal/w<",
        "Lgd/e;",
        "Lfd/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/String;

.field private final e:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Lcc/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lee/b;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/b<",
            "Lcc/a;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    const/16 v1, 0x3391

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/google/android/gms/common/api/internal/w;-><init>([Lca/d;ZI)V

    iput-object p2, p0, Lgd/g$e;->d:Ljava/lang/String;

    iput-object p1, p0, Lgd/g$e;->e:Lee/b;

    return-void
.end method


# virtual methods
.method protected bridge synthetic b(Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    check-cast p1, Lgd/e;

    invoke-virtual {p0, p1, p2}, Lgd/g$e;->f(Lgd/e;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method protected f(Lgd/e;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgd/e;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lfd/c;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lgd/g$d;

    iget-object v1, p0, Lgd/g$e;->e:Lee/b;

    invoke-direct {v0, v1, p2}, Lgd/g$d;-><init>(Lee/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object p2, p0, Lgd/g$e;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lgd/e;->e(Lgd/h$a;Ljava/lang/String;)V

    return-void
.end method
