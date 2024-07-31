.class public final synthetic Lx6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/h;


# instance fields
.field public final synthetic a:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/e;->a:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lx6/e;->a:Ljava/lang/Exception;

    check-cast p1, Lx6/u$a;

    invoke-static {v0, p1}, Lx6/g;->j(Ljava/lang/Exception;Lx6/u$a;)V

    return-void
.end method
