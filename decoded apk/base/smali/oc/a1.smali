.class final Loc/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/c$a;


# instance fields
.field private final synthetic a:Loc/x0;


# direct methods
.method constructor <init>(Loc/x0;)V
    .locals 0

    iput-object p1, p0, Loc/a1;->a:Loc/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Loc/a1;->a:Loc/x0;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Loc/x0;->d(Loc/x0;Z)V

    iget-object p1, p0, Loc/a1;->a:Loc/x0;

    invoke-virtual {p1}, Loc/x0;->b()V

    return-void

    :cond_0
    iget-object p1, p0, Loc/a1;->a:Loc/x0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Loc/x0;->d(Loc/x0;Z)V

    iget-object p1, p0, Loc/a1;->a:Loc/x0;

    invoke-static {p1}, Loc/x0;->f(Loc/x0;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Loc/a1;->a:Loc/x0;

    invoke-static {p1}, Loc/x0;->a(Loc/x0;)Loc/s;

    move-result-object p1

    invoke-virtual {p1}, Loc/s;->c()V

    :cond_1
    return-void
.end method
