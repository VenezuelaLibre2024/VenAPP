.class public Lkc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/b;


# static fields
.field private static final a:Lkc/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkc/b;

    invoke-direct {v0}, Lkc/b;-><init>()V

    sput-object v0, Lkc/b;->a:Lkc/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lkc/b;
    .locals 1

    sget-object v0, Lkc/b;->a:Lkc/b;

    return-object v0
.end method


# virtual methods
.method public a(Lzb/g;)Lec/a;
    .locals 1

    const-class v0, Llc/i;

    invoke-virtual {p1, v0}, Lzb/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lec/a;

    return-object p1
.end method
