.class public La4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La4/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "La4/b<",
        "TR;>;"
    }
.end annotation


# static fields
.field static final a:La4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La4/a<",
            "*>;"
        }
    .end annotation
.end field

.field private static final b:La4/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La4/c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La4/a;

    invoke-direct {v0}, La4/a;-><init>()V

    sput-object v0, La4/a;->a:La4/a;

    new-instance v0, La4/a$a;

    invoke-direct {v0}, La4/a$a;-><init>()V

    sput-object v0, La4/a;->b:La4/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()La4/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">()",
            "La4/c<",
            "TR;>;"
        }
    .end annotation

    sget-object v0, La4/a;->b:La4/c;

    return-object v0
.end method
