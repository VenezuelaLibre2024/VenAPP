.class public final synthetic Ljf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lpc/c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lpc/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljf/a;->a:Ljava/lang/String;

    iput-object p2, p0, Ljf/a;->b:Lpc/c;

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ljf/a;->a:Ljava/lang/String;

    iget-object v1, p0, Ljf/a;->b:Lpc/c;

    invoke-static {v0, v1, p1}, Ljf/b;->b(Ljava/lang/String;Lpc/c;Lpc/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
