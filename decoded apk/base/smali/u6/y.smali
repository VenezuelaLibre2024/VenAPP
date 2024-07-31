.class public final synthetic Lu6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:Lt6/c2;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;Lt6/c2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/y;->a:Lu6/b$a;

    iput-object p2, p0, Lu6/y;->b:Lt6/c2;

    iput p3, p0, Lu6/y;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lu6/y;->a:Lu6/b$a;

    iget-object v1, p0, Lu6/y;->b:Lt6/c2;

    iget v2, p0, Lu6/y;->c:I

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, v2, p1}, Lu6/n1;->a0(Lu6/b$a;Lt6/c2;ILu6/b;)V

    return-void
.end method
