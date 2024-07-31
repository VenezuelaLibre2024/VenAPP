.class public final synthetic Lnc/b;
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

    iput-object p1, p0, Lnc/b;->a:Lnc/g;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Lnc/b;->a:Lnc/g;

    check-cast p1, Lxa/f;

    invoke-static {v0, p1}, Lnc/g;->e(Lnc/g;Lxa/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
