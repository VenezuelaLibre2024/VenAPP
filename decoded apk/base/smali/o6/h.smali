.class public final synthetic Lo6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/b$a;


# instance fields
.field public final synthetic a:Lp6/c;


# direct methods
.method public synthetic constructor <init>(Lp6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/h;->a:Lp6/c;

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo6/h;->a:Lp6/c;

    invoke-interface {v0}, Lp6/c;->e()Lk6/a;

    move-result-object v0

    return-object v0
.end method
