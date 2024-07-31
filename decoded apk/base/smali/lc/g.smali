.class public final synthetic Llc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:Llc/i;


# direct methods
.method public synthetic constructor <init>(Llc/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llc/g;->a:Llc/i;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Llc/g;->a:Llc/i;

    check-cast p1, Llc/c;

    invoke-static {v0, p1}, Llc/i;->e(Llc/i;Llc/c;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
