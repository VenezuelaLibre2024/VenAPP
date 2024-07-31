.class public final synthetic Lye/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lye/h$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lye/h$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lye/g;->a:Ljava/lang/String;

    iput-object p2, p0, Lye/g;->b:Lye/h$a;

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lye/g;->a:Ljava/lang/String;

    iget-object v1, p0, Lye/g;->b:Lye/h$a;

    invoke-static {v0, v1, p1}, Lye/h;->a(Ljava/lang/String;Lye/h$a;Lpc/d;)Lye/f;

    move-result-object p1

    return-object p1
.end method
