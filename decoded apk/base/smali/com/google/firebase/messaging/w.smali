.class public final synthetic Lcom/google/firebase/messaging/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/w;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/w;->a:Ljava/lang/String;

    check-cast p1, Lcom/google/firebase/messaging/e1;

    invoke-static {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->k(Ljava/lang/String;Lcom/google/firebase/messaging/e1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method