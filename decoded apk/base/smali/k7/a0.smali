.class public final synthetic Lk7/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk7/c0$g;


# instance fields
.field public final synthetic a:Lt6/u1;


# direct methods
.method public synthetic constructor <init>(Lt6/u1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/a0;->a:Lt6/u1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lk7/a0;->a:Lt6/u1;

    check-cast p1, Lk7/p;

    invoke-static {v0, p1}, Lk7/c0;->c(Lt6/u1;Lk7/p;)I

    move-result p1

    return p1
.end method
