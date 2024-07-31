.class public final synthetic Lu6/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/p0;->a:Lu6/b$a;

    iput-boolean p2, p0, Lu6/p0;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lu6/p0;->a:Lu6/b$a;

    iget-boolean v1, p0, Lu6/p0;->b:Z

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, p1}, Lu6/n1;->J0(Lu6/b$a;ZLu6/b;)V

    return-void
.end method
