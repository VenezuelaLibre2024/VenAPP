.class public final synthetic Lt6/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lt6/v;


# direct methods
.method public synthetic constructor <init>(Lt6/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/i1;->a:Lt6/v;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lt6/i1;->a:Lt6/v;

    check-cast p1, Lt6/j3$d;

    invoke-static {v0, p1}, Lt6/d1$c;->J(Lt6/v;Lt6/j3$d;)V

    return-void
.end method
