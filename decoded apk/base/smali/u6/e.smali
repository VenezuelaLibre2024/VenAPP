.class public final synthetic Lu6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/e;->a:Lu6/b$a;

    iput-object p2, p0, Lu6/e;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lu6/e;->a:Lu6/b$a;

    iget-object v1, p0, Lu6/e;->b:Ljava/lang/String;

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, p1}, Lu6/n1;->x0(Lu6/b$a;Ljava/lang/String;Lu6/b;)V

    return-void
.end method
