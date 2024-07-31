.class public final synthetic Lu6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$b;


# instance fields
.field public final synthetic a:Lu6/n1;

.field public final synthetic b:Lt6/j3;


# direct methods
.method public synthetic constructor <init>(Lu6/n1;Lt6/j3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/l;->a:Lu6/n1;

    iput-object p2, p0, Lu6/l;->b:Lt6/j3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lt8/l;)V
    .locals 2

    iget-object v0, p0, Lu6/l;->a:Lu6/n1;

    iget-object v1, p0, Lu6/l;->b:Lt6/j3;

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, p1, p2}, Lu6/n1;->K0(Lu6/n1;Lt6/j3;Lu6/b;Lt8/l;)V

    return-void
.end method
