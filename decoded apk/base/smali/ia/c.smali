.class final Lia/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/k$b;


# instance fields
.field final synthetic a:Lha/h;


# direct methods
.method constructor <init>(Lia/d;Lha/h;)V
    .locals 0

    iput-object p2, p0, Lia/c;->a:Lha/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic notifyListener(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lha/a;

    iget-object v0, p0, Lia/c;->a:Lha/h;

    invoke-interface {p1, v0}, Lha/a;->a(Lha/h;)V

    return-void
.end method

.method public final onNotifyListenerFailed()V
    .locals 0

    return-void
.end method
