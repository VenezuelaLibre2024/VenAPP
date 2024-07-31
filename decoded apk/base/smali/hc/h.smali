.class public final synthetic Lhc/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:Lhc/j;


# direct methods
.method public synthetic constructor <init>(Lhc/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhc/h;->a:Lhc/j;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Lhc/h;->a:Lhc/j;

    check-cast p1, Lec/c;

    invoke-static {v0, p1}, Lhc/j;->l(Lhc/j;Lec/c;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
