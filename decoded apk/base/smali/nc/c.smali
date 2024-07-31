.class public final synthetic Lnc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:Lnc/g;


# direct methods
.method public synthetic constructor <init>(Lnc/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/c;->a:Lnc/g;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Lnc/c;->a:Lnc/g;

    check-cast p1, Lxa/e$a;

    invoke-virtual {v0, p1}, Lnc/g;->f(Lxa/e$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
