.class public final synthetic Lt6/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt6/j1;->a:I

    iput-boolean p2, p0, Lt6/j1;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lt6/j1;->a:I

    iget-boolean v1, p0, Lt6/j1;->b:Z

    check-cast p1, Lt6/j3$d;

    invoke-static {v0, v1, p1}, Lt6/d1$c;->F(IZLt6/j3$d;)V

    return-void
.end method
