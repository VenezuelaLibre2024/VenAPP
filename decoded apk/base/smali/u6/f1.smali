.class public final synthetic Lu6/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:Lt6/h2;


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;Lt6/h2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/f1;->a:Lu6/b$a;

    iput-object p2, p0, Lu6/f1;->b:Lt6/h2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lu6/f1;->a:Lu6/b$a;

    iget-object v1, p0, Lu6/f1;->b:Lt6/h2;

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, p1}, Lu6/n1;->s0(Lu6/b$a;Lt6/h2;Lu6/b;)V

    return-void
.end method
