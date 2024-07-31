.class final Loc/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field private final synthetic a:Loc/r;


# direct methods
.method constructor <init>(Loc/r;)V
    .locals 0

    iput-object p1, p0, Loc/u;->a:Loc/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2

    instance-of p1, p1, Lzb/o;

    if-eqz p1, :cond_0

    invoke-static {}, Loc/s;->a()Lga/a;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failure to refresh token; scheduling refresh after failure"

    invoke-virtual {p1, v1, v0}, Lga/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Loc/u;->a:Loc/r;

    iget-object p1, p1, Loc/r;->b:Loc/s;

    invoke-virtual {p1}, Loc/s;->d()V

    :cond_0
    return-void
.end method
